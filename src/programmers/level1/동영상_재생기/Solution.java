package programmers.level1.동영상_재생기;

public class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

        Video video = new Video(video_len, pos, op_start, op_end);
        for (String command : commands) {
            video.control(command);
        }

        return video.pos;
    }

    public class Video {
        String mm = "";
        String ss = "";
        int calculatedSs;
        String video_len;
        String pos;
        String op_start;
        String op_end;

        public Video(String video_len, String pos, String op_start, String op_end) {
            this.video_len = video_len;
            this.pos = pos;
            this.op_start = op_start;
            this.op_end = op_end;
        }

        public void prev() {
            this.isInOpening();

            mm = this.pos.split(":")[0];
            ss = this.pos.split(":")[1];
            calculatedSs = (Integer.parseInt(ss) - 10);
            if (calculatedSs < 0) {
                calculatedSs += 60;
                mm = String.format("%02d", (Integer.parseInt(mm) - 1));
            }
            this.pos = mm + ":" + String.format("%02d", calculatedSs);

            if (this.pos.startsWith("-")) {
                this.pos = "00:00";
            }

            this.isInOpening();

        }

        public void next() {
            this.isInOpening();
            mm = this.pos.split(":")[0];
            ss = this.pos.split(":")[1];
            calculatedSs = (Integer.parseInt(ss) + 10);
            if (calculatedSs > 59) {
                calculatedSs -= 60;
                mm = String.format("%02d", (Integer.parseInt(mm) + 1));
            }
            this.pos = mm + ":" + String.format("%02d", calculatedSs);

            if (this.pos.compareTo(this.video_len) > 0) {
                this.pos = this.video_len;
            }

            this.isInOpening();
        }

        public void control(String command) {
            if ("prev".equals(command)) {
                this.prev();
            } else if ("next".equals(command)) {
                this.next();
            }
        }

        public void isInOpening() {
            if (this.pos.compareTo(this.op_start) > -1 && this.op_end.compareTo(this.pos) > -1) {
                this.pos = this.op_end;
            }
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String video_len1 = "34:33";
        String pos1 = "13:00";
        String op_start1 = "00:55";
        String op_end1 = "02:55";
        String commands1[] = { "next", "prev" };

        System.out.println(solution.solution(video_len1, pos1, op_start1, op_end1, commands1));

        System.out.println(
                solution.solution("10:55", "00:05", "00:15", "06:55", new String[] { "prev", "next", "next" }));
        System.out.println(solution.solution("30:00", "29:55", "01:00", "01:30", new String[] { "next" }));

    }
}
