package package1;

public class InplInterface1 implements ExempleInterface  {

	// Le nouveau mot clé implements qui relie notre classe à l'interface ExempleInterface
	
	public int v1;
	public int v2;
	
	public int minimum() {
		return(Math.min(v1, v2));
	}
	
	public int maximum() {
		return(Math.max(v1, v2));
	}

	public int getV1() {
		return v1;
	}

	public void setV1(int v1) {
		this.v1 = v1;
	}

	public int getV2() {
		return v2;
	}

	public void setV2(int v2) {
		this.v2 = v2;
	}
}
