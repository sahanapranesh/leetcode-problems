package com.leetcode.problems;

import java.io.*;

public class FileRead {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/sahanapranesh/IdeaProjects/leetcode-problems/src/main/java/com/" +
                "leetcode/problems/FileRead.java")));
            String line;
            while((line  = bufferedReader.readLine()) !=null) {
                stringBuilder.append(line);
            }
        System.out.println(stringBuilder);
    }
}
