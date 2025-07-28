class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int colour) {
        int present = image[sr][sc];
        if(present==colour){
            return image;
        }
        help(image,sr, sc, colour, present);
        return image;
    }
    public static void help(int[][] image,int sr, int sc, int colour, int present){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length){
            return;
        }
        if(image[sr][sc]!=present){
            return;
        }
        image[sr][sc]=colour;
        
        help(image,sr-1, sc, colour, present);
        help(image,sr+1, sc, colour, present);
        help(image,sr, sc-1, colour, present);
        help(image,sr, sc+1, colour, present);
        
    }

}