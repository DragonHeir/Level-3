void setup(){
 int width = 30;
 int height = 12;
 int basecount = 14;
 size(500,500);
 for(int i = basecount; i > 0; i--){
   for(int j = i; j > 0; j--){
     rect(250-((width*i)/2)-width+(width*j),400-(height*basecount)+(height*i),width, height);
   }
 }
}