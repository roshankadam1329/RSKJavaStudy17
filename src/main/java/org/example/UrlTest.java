package org.example;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest {

  public static String getBaseUrl(String urlString) {
    try {
      URL url = new URL(urlString);
      return url.getProtocol() + "://" + url.getHost() + (url.getPort() != -1 ? ":" + url.getPort() : "");
    } catch (MalformedURLException e) {
      throw new IllegalArgumentException("Invalid URL provided", e);
    }
  }

  public static void main(String[] args) {
    String url = "http://example.svc.cluster.local/path/to/resource?query=param";
    String baseUrl = getBaseUrl(url);
    System.out.println("Base URL: " + baseUrl);
    Thread.currentThread().interrupt();
  }
}
