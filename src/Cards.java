public class Cards {


    public Cards(){
         String suit;
//         int rank = 0;
         int value;
         int [] rank = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        int random = (int) (Math.random() * 14 + 1);

         for(int i = 0; i<rank.length; i++){
             if(rank[i] == random) {
                 value = rank[i];
             }
         }
    }
}
