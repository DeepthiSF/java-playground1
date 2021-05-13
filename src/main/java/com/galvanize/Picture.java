package com.galvanize;

class PictureChallenge {
    private boolean framed;
    private int height;
    private int width;

    PictureChallenge(boolean framed, int height, int width) {
        this.framed = framed;
        this.height = height;
        this.width = width;
    }

    PictureChallenge(int height, int width){
        this(false, height, width);
    }

    public String toString() {
        return "Picture{" + "framed=" + framed + ", height=" + height + ", width=" + width + '}';
    }
}

public class Picture{

    public static void main(String[] args) {

        PictureChallenge picture1 = new PictureChallenge(6, 8);
        System.out.println(picture1);
    }
}


