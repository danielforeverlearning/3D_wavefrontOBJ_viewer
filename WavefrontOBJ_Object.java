

import java.util.ArrayList;

public class WavefrontOBJ_Object {
	
	String my_object_name;
	
	ArrayList<Double> Vertex_X;
	ArrayList<Double> Vertex_Y;
	ArrayList<Double> Vertex_Z;
	
	ArrayList<Double> VertexNormal_X;
	ArrayList<Double> VertexNormal_Y;
	ArrayList<Double> VertexNormal_Z;
	
	//1-based not 0-based, for now no TextureIndex
	//Faces are defined using lists of vertex, texture and normal indices
	//in the format 
	//vertex_index/texture_index/normal_index
	//for which each index starts at 1 and increases corresponding to the order
	//in which the referenced element was defined.
	ArrayList<Integer> Vertex_Index;
	ArrayList<Integer> Normal_Index;

	public WavefrontOBJ_Object(String str) {
		
		my_object_name = str;
		
		Vertex_X = new ArrayList<Double>();
		Vertex_Y = new ArrayList<Double>();
		Vertex_Z = new ArrayList<Double>();
		
		VertexNormal_X = new ArrayList<Double>();
		VertexNormal_Y = new ArrayList<Double>();
		VertexNormal_Z = new ArrayList<Double>();
		
		Vertex_Index = new ArrayList<Integer>();
		Normal_Index = new ArrayList<Integer>();
	}
}//class

