# mp3agic examples

Example applications using the [mp3agic](https://github.com/mpatric/mp3agic "mp3agic") library.

All the examples are command-line applications written in Java, with corresponding wrapper shell scripts. If you're on MacOS or a flavour of Unix, you're set to use the scripts. If you're on Windows, try [Cygwin](http://www.cygwin.com/ "Cygwin") or rewrite the bash scripts as bat/cmd files.

* mp3cat - lists the details of the specified mp3 file(s) in comma-delimited format
* mp3details - displays all the details of the specified mp3 file(s)
* mp3move - moves the specified mp3 file(s) to a new location, creating appropriate folders for the Artist and Album
* mp3pics - extracts the album art images from the specified mp3 file(s)
* mp3rename - renames the specified mp3 file(s) using data from the mp3 id3 tags
* mp3retag - retags the specified mp3 file(s)

## Building

You will need:

* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html "JDK") 5 or higher
* [maven](http://maven.apache.org/ "maven")

Useful maven goals:

* clean - remove binaries, docs and temporary build files
* compile - compile the library and applications
* test - run all unit tests
* package - package compiled code into a jar

## Installing command-line apps locally

The command-line apps can be installed locally for use on the command line by running the scripts/install.sh script, passing in the destination folder as a parameter. For example:

    scripts/install.sh "/usr/local/mp3agic/"

## Contributing

If you have added a feature or fixed a bug and want to share it, please submit a pull request as follows:

* Fork the project
* Write the code for your feature or bug fix
* Please don't auto-format the code or make wholesale whitespace changes as it makes seeing what has changed more difficult
* Add tests! This is important so the code you've added doesn't get unintentionally broken in the future
* Make sure the existing tests all pass
* Commit and do not mess with version, or history
* Submit a pull request

Thanks for sharing!

## Copyright

Copyright (c) 2006-2013 Michael Patricios. See mit-license.txt for details.
