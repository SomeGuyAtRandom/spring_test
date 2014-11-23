package la.random.spring.shapes;

public class Vector {
	
	private Point diangle;
	
	public Vector(){
		System.out.println("Vector()");
	}
	
	public Vector(Point diangle){
		System.out.println("Vector(diangle)");
		this.diangle =diangle;
	}
	
	public void draw(){
		
		System.out.print("Vector.draw() @ point: ");
		if(diangle== null){
			System.out.print("null");
		}else{
			System.out.print(diangle.toString());
		}
		System.out.println();
		
	}
	
	public Point getDiangle() {
		return diangle;
	}

	public void setDiangle(Point diangle) {
		this.diangle = diangle;
	}
}
