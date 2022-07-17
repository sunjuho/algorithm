package baekjoon.level06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.acmicpc.net/problem/2941

예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

크로아티아 알파벳	변경
č	c=
ć	c-
dž	dz=
đ	d-
lj	lj
nj	nj
š	s=
ž	z=
예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 */
public class Problem09_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        String str = br.readLine();

        // 중복될 수 있는 z=와 dz= 중 dz= 먼저 변경. 크로아티아 알파벳과 일치하지 않는 임의의 a.
        str = str.replace("dz=", "a");
        str = str.replace("z=", "a");
        str = str.replace("s=", "a");
        str = str.replace("nj", "a");
        str = str.replace("lj", "a");
        str = str.replace("d-", "a");
        str = str.replace("c-", "a");
        str = str.replace("c=", "a");

        System.out.println(str.length());
    }
}
