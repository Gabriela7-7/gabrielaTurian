package Tema2;

public class ANNALIS {



public static boolean prisonerIsAwake=false;
public static boolean knightIsAwake=false;
public static boolean archgerIsAwake=true;
    public static boolean petDogIsPresent=false;

    public static void main(String[] args) {

        System.out.println(canFastAttack(knightIsAwake));
        System.out.println(canSpy(knightIsAwake,archgerIsAwake));
        System.out.println(canSignalPrisoner(archgerIsAwake,prisonerIsAwake));
        System.out.println(canBeFreed(knightIsAwake,archgerIsAwake,prisonerIsAwake,petDogIsPresent));
    }
       static boolean canFastAttack( boolean knightIsAwake ){
            return !knightIsAwake;
        }
static boolean canSpy(boolean knightIsAwake,boolean archgerIsAwake){
        return ( !knightIsAwake || archgerIsAwake||prisonerIsAwake);
}
static  boolean canSignalPrisoner(boolean archgerIsAwake,boolean prisonerIsAwake){
        return (!archgerIsAwake&&!prisonerIsAwake );
}
static boolean canBeFreed( boolean knightIsAwake,boolean archgerIsAwake,
                           boolean prisonerIsAwake,boolean petDogIsPresent){
        return ( !knightIsAwake&&!archgerIsAwake&&!prisonerIsAwake&&!petDogIsPresent);
    }
}


