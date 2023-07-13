package com.interview.prep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

import com.google.gson.*;

public class FootballSession {

        public static int run(String teamKey) {
            /*
             * Write your code below; return type and arguments should be according to the problem's requirements
             */
            int goals = 0;
            try {
                StringBuilder result = new StringBuilder();
                URL url = new URL("https://s3.eu-west-1.amazonaws.com/hackajob-assets1.p.hackajob/challenges/football_session/football.json");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                while ((line = rd.readLine()) != null) {
                    result.append(line);
                }
                rd.close();
                JsonObject jsonObject = new JsonParser().parse(result.toString()).getAsJsonObject();
                Iterator<JsonElement> rounds = jsonObject.getAsJsonArray("rounds").getAsJsonArray().iterator();
                while(rounds.hasNext()){
                    Iterator<JsonElement> matchesIterator = rounds.next().getAsJsonObject().getAsJsonArray("matches").iterator();
                    while(matchesIterator.hasNext()){
                        JsonElement match = matchesIterator.next();
                        JsonElement team1 = match.getAsJsonObject().get("team1");
                        JsonElement team2 = match.getAsJsonObject().get("team2");
                        if(team1.getAsJsonObject().get("key").getAsString().equals(teamKey)){
                            goals =  goals + match.getAsJsonObject().get("score1").getAsInt();
                        }
                        else if(team2.getAsJsonObject().get("key").getAsString().equals(teamKey)){
                            goals = goals + match.getAsJsonObject().get("score2").getAsInt();
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(goals);
            return goals;
    }

    public static void main(String[] args) {
        run("arsenal");
    }
}


