package url.com;

import java.util.HashMap;
import java.util.Map;

public class URLShortener {
    private Map<String, String> urlMap;

    public URLShortener() {
        urlMap = new HashMap<>();
    }

    // Method to generate a short code for a long URL
    public String shortenURL(String longURL) {
        String shortCode = generateShortCode();
        urlMap.put(shortCode, longURL);
        return shortCode;
    }

    // Method to redirect to the original URL given a short code
    public String redirectToOriginalURL(String shortCode) {
        return urlMap.get(shortCode);
    }

    // Method to generate a short code (you can replace it with your own implementation)
    private String generateShortCode() {
        // This is a simple implementation using random numbers
        return Long.toString(System.nanoTime(), 36);
    }

    public static void main(String[] args) {
        URLShortener shortener = new URLShortener();

        // Shorten a URL
        String longURL = "https://www.example.com";
        String shortCode = shortener.shortenURL(longURL);
        System.out.println("Shortened URL: " + shortCode);

        // Redirect to the original URL
        String originalURL = shortener.redirectToOriginalURL(shortCode);
        System.out.println("Original URL: " + originalURL);
    }
}