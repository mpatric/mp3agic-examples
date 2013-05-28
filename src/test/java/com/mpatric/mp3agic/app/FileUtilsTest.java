package com.mpatric.mp3agic.app;

import com.mpatric.mp3agic.app.FileUtils;

import junit.framework.TestCase;

public class FileUtilsTest extends TestCase {

  public void testShouldStripPathsFromFilenames() throws Exception {
    assertEquals("test.mp3", FileUtils.extractFilename("test.mp3"));
    assertEquals("test.mp3", FileUtils.extractFilename("/test.mp3"));
    assertEquals("test.mp3", FileUtils.extractFilename("\\test.mp3"));
    assertEquals("test.mp3", FileUtils.extractFilename("/something/else/test.mp3"));
    assertEquals("test.mp3", FileUtils.extractFilename("\\something\\else\\test.mp3"));
    assertEquals("test.mp3", FileUtils.extractFilename("C:/something/else/test.mp3"));
    assertEquals("test.mp3", FileUtils.extractFilename("C:\\something\\else\\test.mp3"));
    assertEquals("test.mp3", FileUtils.extractFilename("C:/something\\else/test.mp3"));
    assertEquals("test.mp3", FileUtils.extractFilename("C:\\something/else\\test.mp3"));
  }
  
  public void testShouldStripFilenamesFromPaths() throws Exception {
    assertEquals("", FileUtils.extractPath("test.mp3"));
    assertEquals("/", FileUtils.extractPath("/"));
    assertEquals("/", FileUtils.extractPath("/test.mp3"));
    assertEquals("\\", FileUtils.extractPath("\\test.mp3"));
    assertEquals("/something/else/", FileUtils.extractPath("/something/else/test.mp3"));
    assertEquals("\\something\\else\\", FileUtils.extractPath("\\something\\else\\test.mp3"));
    assertEquals("C:/something/else/", FileUtils.extractPath("C:/something/else/test.mp3"));
    assertEquals("C:\\something\\else\\", FileUtils.extractPath("C:\\something\\else\\test.mp3"));
    assertEquals("C:/something\\else/", FileUtils.extractPath("C:/something\\else/test.mp3"));
    assertEquals("C:\\something/else\\", FileUtils.extractPath("C:\\something/else\\test.mp3"));
  }
}
