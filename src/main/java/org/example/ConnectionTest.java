package org.example;

import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectionTest {

  public static void main(String[] args) throws Exception {
    System.out.println("HTTP Proxy Host: " + System.getProperty("http.proxyHost"));
    System.out.println("HTTP Proxy Port: " + System.getProperty("http.proxyPort"));
    makeNetworkCall("http://www.google.com");
    makeNetworkCall("http://dev-proxy.fdc.leni.ai/project-manager/connections/api/ConnectionManager/v1/connection/3f330b15-99fe-4be7-b798-091045b13342");
  }

  private static void makeNetworkCall(String urlString) throws Exception {
    System.out.println("calling " + urlString);

    URL url = new URL(urlString);
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
    connection.setConnectTimeout(20000);
    connection.setReadTimeout(
        20000); // 20 seconds timeout    int responseCode = connection.getResponseCode();    System.out.println("HTTP response code: " + responseCode);  } catch (IOException e) {    System.out.println("Network access test failed: " + e.getMessage());  }}

    int responseCode = connection.getResponseCode();
    System.out.println("HTTP response code: " + responseCode);
  }
}