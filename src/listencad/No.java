package listencad;

public class No {
	private float info;
	private No prox;

	public No(){
		this.info = 0;
	}

	public float consultaInfo(){
		return this.info;
	};

	public No consultaProx(){
		return this.prox;
	};

	public void atribInfo(float val){
		this.info = val;
	};

	public void atribProx(No p){
		this.prox = p;
	};
}
