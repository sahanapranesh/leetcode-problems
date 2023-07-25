package com.leetcode.problems.medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0.
 * Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
 *
 * When you visit a room, you may find a set of distinct keys in it.
 * Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
 *
 * Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.
 */

public class KeysAndRooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms.get(0), visited, 0, rooms);
        for (boolean b : visited) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static void dfs(List<Integer> keys, boolean[] visited, int room, List<List<Integer>> rooms){
        visited[room] =true;
        for(Integer i: keys){
            if(!visited[i]){
                dfs(rooms.get(i), visited, i,rooms);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(0,List.of(1,3));
        rooms.add(1,List.of(3,0,1));
        rooms.add(2,List.of(2));
        rooms.add(3,List.of(0));
        System.out.println(canVisitAllRooms(rooms));
    }
}
