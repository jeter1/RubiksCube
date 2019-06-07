
public class RubiksCube {
	
	private class Cube {
		
		public class Face {
			public final String[][] face = new String[2][2];
			
			public Face(String tr, String tl, String br, String bl) {
				face[0][0] = tl;
				face[0][1] = tr;
				face[1][0] = bl;
				face[1][1] = br;
			}
		}
		
		public final Face[] faces = new Face[6];
		
		public Cube (Face tf, Face bf, Face lf, Face ff, Face rf, Face bof) {
			faces[0] = tf; // Top face is 1!
			faces[1] = bf; // Back face is 2!
			faces[2] = lf; // Left face is 3!
			faces[3] = ff; // Front face is 4!
			faces[4] = rf; // Right face is 5!
			faces[5] = bof; // Bottom face is 6!
		}
	}
	
	// public class Move
	
	public String solve(Cube c) {
		return solve(c,  )
	}
	
	public static int getFace(long cube, int n) {
		
		long div = 1;
		for (int i = 0; i < n; i++) div *= 6;
		cube /= div;
		return (int)(cube % 6);
	}
	
	public String solve(Cube c, int movesLeft) {
		if (movesLeft == 0) {
			for (RubiksCube.Cube.Face ): c.faces) {
				for (String color: c.faces[faceID]) {
					
				}
			}
		}
	}
	
	public Cube backFaceRotateRight(Cube c){
		
	}
	
	public Cube backFaceRotateLeft(Cube c){
		
	}
	
	public Cube frontFaceRotateRight(Cube c){
		
	}
	
	public Cube frontFaceRotateLeft(Cube c){
		
	}
	
	public Cube leftFaceRotateBack(Cube c){
		
	}
	
	public Cube topFaceRotateRight(Cube c){
		
	}

	public Cube topFaceRotateLeft(Cube c){
		
	}
}
