

public class birdwatcher {


 // public static void main( string[] args)  {
 //   int [] birdsThisWEEK= {0,2,5,3,7,8,4} ;
    //    getLASTWEEK(birdsThisWEEK);
    //   System.out.println(getToday(birdsThisWEEK));
    //   System.out.println(incrementToday(birdsThisWEEK));


//static void getLASTWEEK(int []array) {
// for (int i=o;i< array.length;i++) {
//   if (i==0) {
//      System.out.println(i++array[i]);
//  }
                    //  System.out.println(array[i]);
        public static void birdwatcher(String[] args) {
    int [] birdsThisWEEK={2,0,5,3,7,8,4}
            getLastWeek(birdsThisWEEK);
    System.out.println(”Today= ” + getToday(birdsThisWEEK));
    System.out.println(” Today `s increment= +incrementToday(birdsThisWEEK));
    System.out.println(” days WithoutBirds ?” + days WithoutBirds(birdsThisWEEK));
    System.out.println(”Sum for  theree days= ” + getCountForFirstDays(birdsThisWEEK,days:3));
    System.out.println(”Busy days= + getBusyDays(birdsThisWEEK));
            System.out.println(”Busy days =” +getBusydays(birdsThisWEEK));
}
static void getLastWeek(int[]birdArray){
    for (int bird: birdArray){
        System.out.println(bird + ” ”);
    }
static int incrementToday(int[] birdArray){
        return ++birdArray[birdArray.length-1];
    }

    static boolean daysWithoutBirds (int[] birdArray){
for (int i=0; i<birdArray.length;i++) {
if (birdArray[i]==0){
    return true;
}
static int getcountForFirstDays(int [] birdsArray,int days){
    int sum=0;
    for (i=0; i<days;i++){
     sum+=birdArray[i];

return sum;
    }
    static int getBusyDays(int[] birdArray){
        int busyDays=0;
        for (int i=0; i<birdArray.length;i++){
            if (birdArray[i] >=5){
                busyDAYS++;
            }
            }
        return busyDays;
        }
        }

}
    }