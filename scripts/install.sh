#!/bin/sh
if test "$1" = ""; then
  echo
  echo "This script installs the command line tools in the mp3agic-examples project"
  echo "into a local folder so they can be used from the command line."
  echo
  echo "Usage: install.sh [install path]"
  echo
  echo "Example: install.sh /usr/local/mp3agic/"
  echo
  exit 2
fi

if [ ! -f pom.xml ]; then
  echo
  echo "Please run from root folder of project: scripts/install.sh /usr/local/mp3agic"
  echo
  exit 3
fi

mvn package
rc=$?
if [[ $rc != 0 ]] ; then
  echo
  echo "Building jar failed"
  echo
  exit $rc
fi

cp target/mp3agic-examples-*-SNAPSHOT-jar-with-dependencies.jar target/mp3agic-apps.jar
rc=$?
if [[ $rc != 0 ]] ; then
  echo
  echo "Jar file not found"
  echo
  exit $rc
fi

mkdir -p "${1}"
rc=$?
if [[ $rc != 0 ]] ; then
  echo
  echo "Could not create directory ${1}"
  echo
  exit $rc
fi

cp target/mp3agic-apps.jar "${1}/mp3agic-apps.jar"
rc=$?
if [[ $rc != 0 ]] ; then
  echo
  echo "Could not copy into ${1}"
  echo
  exit $rc
fi

scripts=('mp3cat' 'mp3details' 'mp3move' 'mp3pics' 'mp3rename' 'mp3retag')
for filename in "${scripts[@]}"
do
  sed -n '1p' "scripts/${filename}" > "target/${filename}"
  echo "MP3AGIC_INSTALL_PATH=\"${1}\"" >> "target/${filename}"
  sed '1d' "scripts/${filename}" >> "target/${filename}"
  chmod +x "target/${filename}"
  cp "target/${filename}" "${1}/${filename}"
  rc=$?
  if [[ $rc != 0 ]] ; then
    echo
    echo "Could not copy into ${1}"
    echo
    exit $rc
  fi
done
