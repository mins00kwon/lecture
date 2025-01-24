package com.ohgiraffers.section03.branching;

public class Solution {
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        // mm:ss 형식이며
        // 0 을 통해 자리는 반드시 맞춤

        // pos: 현재 위치
        int pos_min = getMinute(pos);
        int pos_sec = getSecond(pos);
        int pos_time = minToSec(pos_min, pos_sec);

        // video_len: 비디오 길이
        int end_min = getMinute(video_len);
        int end_sec = getSecond(video_len);
        int end_time = minToSec(end_min, end_sec);

        // op_start: 오프닝 시작 시간
        int op_start_min = getMinute(op_start);
        int op_start_sec = getSecond(op_start);
        int op_start_time = minToSec(op_start_min, op_start_sec);

        // op_end: 오프닝 종료 시간
        int op_end_min = getMinute(op_end);
        int op_end_sec = getSecond(op_end);
        int op_end_time = minToSec(op_end_min, op_end_sec);

        //각 command에 대해
        for (int i = 0; i < commands.length; i++) {
            // 현재 시간이 op 에 해당하면
            // opend 시간으로 이동
            if (pos_time >= op_start_time && pos_time <= op_end_time) {
                pos_time = op_end_time;
            }

            //입력이 prev인 경우
            if (commands[i].equals("prev")) {
                //현재 위치가 10초 미만이면
                if (pos_time < 10) {
                    //처음 위치로 이동
                    pos_time = 0;
                } else {
                    //현재 위치에서 10초 전으로 이동
                    pos_time = pos_time - 10;
                }
            }
            //10초 후로 이동
            //입력이 next인 경우

            //마지막 위치로 이동
            //마지막 위치=동영상의 길이
            else {
                //남은 시간이 10초 미만인 경우
                if (pos_time + 10 > end_time) {
                    pos_time = end_time;
                }
                //현재 위치에서 10초 후로 이동
                else {
                    pos_time = pos_time + 10;
                }
            }
            // 현재 시간이 op 에 해당하면
            // opend 시간으로 이동
            if (pos_time >= op_start_time && pos_time <= op_end_time) {
                pos_time = op_end_time;
            }

        }
        answer = secsToMinutes(pos_time);
        return answer;
    }

    // 초를 분+초 구조로 바꾸는 함수
    public static String secsToMinutes(int secs) {
        String minutes = "";
        if (secs < 600) {
            minutes = "0";
        }
        minutes += Integer.toString(secs / 60);
        String secconds = "";
        if (secs % 60 < 10) {
            secconds = secconds + "0";
        }
        secconds += Integer.toString(secs % 60);

        return minutes + ":" + secconds;
    }

    // 분+초 를 모두 초로 바꾸는 함수
    public static int minToSec(int minute, int second) {
        return minute * 60 + second;
    }

    // 분을 구하는 함수
    public static int getMinute(String time) {
        return Integer.parseInt(time.split(":")[0]);
    }

    // 초를 구하는 함수
    public static int getSecond(String time) {
        return Integer.parseInt(time.split(":")[1]);
    }
}