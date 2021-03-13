include -----;

int height;

void func(){
  for(int i = 1; i < height; i++){
     for(int j = 1; j < i; j++){
     printf("*");
    }
    printf("\n");
  } 
}

void main(){
 // Read height
  height = 10;
  func();   
}