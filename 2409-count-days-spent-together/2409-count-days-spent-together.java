class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] freq = new int[366];
        int[] days = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        String[] aliceArrive = arriveAlice.split("-");
        String[] aliceLeave = leaveAlice.split("-");
        String[] bobArrive = arriveBob.split("-");
        String[] bobLeave = leaveBob.split("-");
        int month = Integer.parseInt(aliceArrive[0]);
        int AliceS = days[month - 1];
        AliceS += Integer.parseInt(aliceArrive[1]);
        month = Integer.parseInt(aliceLeave[0]);
        int AliceL = days[month - 1];
        AliceL += Integer.parseInt(aliceLeave[1]);
        for(int i = AliceS ; i <= AliceL ; i++){
            freq[i]++;
        }

        month = Integer.parseInt(bobArrive[0]);
        int BobS = days[month - 1];
        BobS += Integer.parseInt(bobArrive[1]);
        month = Integer.parseInt(bobLeave[0]);
        int BobL = days[month - 1];
        BobL += Integer.parseInt(bobLeave[1]);
        for(int i = BobS ; i <= BobL ; i++){
            freq[i]++;
        }

        int count = 0;
        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 1) count++;
        }

        return count;
        
        
    }
}