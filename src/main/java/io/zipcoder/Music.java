package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int countForward = 0;
        int countBackward = 0;

        for (int i = startIndex; i < this.playList.length; i++) {
            if (this.playList[i].equals(selection)) {
                break;
            }
            countForward++;
        }

        for(int i=startIndex; i >=0 ; i--){
            if(this.playList[i].equals(selection)){
                break;
            }
            countBackward++;
            if (i==0 && !this.playList[i].equals(selection)){
                i = this.playList.length;
            }
        }

        if (countForward < countBackward) {
            return countForward;
        }
        return countBackward;
        }
}
