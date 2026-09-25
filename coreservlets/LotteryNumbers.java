package coreservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LotteryNumbers extends HttpServlet{
    public long modTime;
    private int[] numbers = new int[10];


    public void init() throws ServletException {
        modTime = System.currentTimeMillis()/1000*1000;
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNum(i);
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Your lottery numbers";
        String docType = "<doctype html>";
        out.println("<html> \n" + "<head><title>"+title+"</title></head>\n" +
            "<body bgcolor=\"#fdf5e6\">" +
            "<h1 align=center>" +title + "</h1>" +
            "<b>Based upon extensive research  of astro-illogical phsycic farces and detailed statistical  claptrap, we have chosen the" +numbers.length +" best lottery numbers for you</b>"+
            "<ol>"
        );

        for(int i =0; i<numbers.length; i++) {
            out.println("<li>" + numbers[1]);
        }

        out.println("</ol>" + "</body></html>");
    }

    public long getLastModified(HttpServletRequest request) {
        return modTime;
    }
    private int randomNum() {
        return  (int)(Math.random()* 100);
    }
}
