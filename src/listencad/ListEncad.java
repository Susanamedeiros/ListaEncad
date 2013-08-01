package listencad;

public class ListEncad {
	private No pri;
	private No it;

	public ListEncad(){
		this.pri = null;
		this.it = null;
	}

	public float Consulta()  throws  IndexOutOfBoundsException{
		if(this.it != null)
	        return this.it.consultaInfo();
	    else
	    	 throw new IndexOutOfBoundsException("Erro: n� inv�lido!");
	}

	public void Atribui(float val)   throws  IndexOutOfBoundsException{
		if(this.it != null)
	        this.it.atribInfo(val);
	    else
	    	throw new IndexOutOfBoundsException("Erro: n� inv�lido!");
	}
	
	public void InserePri (float val){
		No p = new No();
		p.atribInfo(val);
		p.atribProx(this.pri);
		this.pri = p;
	}
	
	public void EliminaPri(){
		No p;
		if (this.pri != null){
			p = this.pri;
			this.pri = p.consultaProx();
		}
	}

	public boolean Busca (float val){
		No p;
		for(p = pri; p != null; p = p.consultaProx())
		    {
		        if(p.consultaInfo() == val)
		            return true;
		    }
		return false;
	}

	public void Inicio(){
		this.it = this.pri;
	}

	public void ProximoNo(){
		this.it = this.it.consultaProx(); 
	}

	public boolean FimDaLista(){
		return (this.it == null);
	}

	public void imprime(){
		while(FimDaLista())
	    {
	        System.out.println(Consulta() + " ");
	        ProximoNo();
	    }
	}
}
