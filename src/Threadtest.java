
class Demo implements Runnable{

	int low;
	int height;
	public Demo(int low,int height){
		this.low=low;
		this.height=height;
	}
	@Override
	public void run() {
		for(int i=low;i<height;i++){
			int count=0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count<2){
				System.out.println(i);//´òÓ¡ËØÊý
			}
		}
		
	}
	
	
}




public class Threadtest {
    public static void main(String args[]){
    	for(int i=0;i<4;i++){
    		Demo d=new Demo(1+i*1000,1000+i*1000);
    		Thread t =new Thread(d);
    		t.start();
    	}
    }
}
