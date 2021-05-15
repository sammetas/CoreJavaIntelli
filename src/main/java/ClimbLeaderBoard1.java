import java.util.*;
import java.util.stream.Collectors;

/*
  Every time the new score comes we need to adjust existing score board/map
  as per their score and ranks.
  1.same score -->equal rank. highest is rank 1.
 */
public class ClimbLeaderBoard1 {
   static LinkedList l = new LinkedList();
    public static void main(String[] args) {

        //List<Integer> ranked = Arrays.asList(new Integer[]{100, 90, 90, 80, 75, 60});
        List<Integer> ranked = Arrays.asList(new Integer[]{100,100,50,40,40,20,10});
        //List<Integer> player = Arrays.asList(new Integer[]{50, 65, 77, 90, 102});
        List<Integer> player = Arrays.asList(new Integer[]{5,25,50,120});


        int[] ranks = new int[ranked.size()];
        int j = 0;
        int rank = 1;
        for (int i = 0; i < ranked.size(); i++) {

            if (i == 0) {
                ranks[j] = rank;
            } else {
                if (ranked.get(i) < ranked.get(i - 1)) {
                    rank++;
                    ranks[j] = rank;
                } else {
                    if (ranked.get(i).equals(ranked.get(i - 1))) {
                        ranks[j] = rank;
                    }/*else{rank++;
                         ranks[j++]=rank;
                     }*/
                }

            }
            j++;

        }

        for (int i = 0; i < ranks.length; i++) {
          //  System.out.print(ranks[i] + " ,");
        }

        Integer[] rankedArr = new Integer[ranked.size()];
        rankedArr = ranked.toArray(rankedArr);
       // System.out.println("Altered Ranked Array::");
        for (int i = 0; i < player.size(); i++) {

            int returnPos = adjustRank(ranks, player.get(i), rankedArr);
//           l.add(returnPos);
            rankedArr = AdjustRankedArray(rankedArr, returnPos, player.get(i));


              ranks = getFinalRank(rankedArr, returnPos, ranks, player.get(i));
           // System.out.println("finalRankfinalRank=====" + finalRank);
            for(int k=0;k<ranks.length;k++){
            //    System.out.print(ranks[k]+", ");
            }
           // System.out.println();


        }

        System.out.println(l);
    }

    private static int[] getFinalRank(Integer[] rankedArr, int returnPos, int[] ranks, int score) {
        //System.out.println("returnPos"+returnPos);
        int finalRank = -1;
        int[] newRanks = new int[ranks.length + 1];
        int i = 0;
        int j = 0;
        int k=1;
        int currRank = 1;

        if (returnPos == 0) {
            if(k==1)
            finalRank=k;
            newRanks[0]=k;


            while (k <ranks.length) {
                if (newRanks[k - 1] == ranks[k]) {
                    newRanks[k]=k;
                }
                newRanks[k] = ranks[k-1];
                k++;
            }
        } else {
            while (j <= returnPos - 1) {
                newRanks[j] = ranks[j];
                j++;
            }
            int prevRank = ranks[returnPos - 1];

            while (returnPos < newRanks.length) {
                if (rankedArr[returnPos - 1] == rankedArr[returnPos]) {
                    newRanks[returnPos] = prevRank;
                    if (i == 0) {
                        finalRank = prevRank;
                        i++;
                    }
                } else {
                    newRanks[returnPos] = ++prevRank;
                    if (i == 0) {
                        finalRank = prevRank;
                        i++;
                    }
                }
                returnPos++;
            }


        }
       /* for (int ii = 0; ii < newRanks.length; ii++) {
            System.out.print(newRanks[ii] + "-");
        }*/
       // ranks = newRanks;
        l.add(finalRank);
        return newRanks;
    }

    private static Integer[] AdjustRankedArray(Integer[] rankedArr, int returnPos, int score) {
        Integer newRankedArr[] = new Integer[rankedArr.length + 1];
        int i = 0;
        if (returnPos == 0) {
            newRankedArr[0] = score;
            for (int j = 1; j < rankedArr.length; j++) {
                newRankedArr[j] = rankedArr[j];
            }
        } else {
            while (i < returnPos) {
                newRankedArr[i] = rankedArr[i];
                i++;
            }
            newRankedArr[i++] = score;
            while(i<newRankedArr.length){
                newRankedArr[i]=rankedArr[i-1];
                i++;
            }
        }


        return newRankedArr;
    }

    private static int adjustRank(int[] ranks, Integer score, Integer[] ranked) {
        int pos = -1;

        int i = 0;
        int size = ranked.length;
        while (i < size) {

            if (ranked[i] == score) {
                pos = i;
                break;
            } else if (score < ranked[i]) {
                pos = ++i;
            } else {
                pos = i;
                break;
            }
        }


        //  System.out.println(pos);
        return pos;
    }


}

