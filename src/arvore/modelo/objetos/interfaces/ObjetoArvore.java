package arvore.modelo.objetos.interfaces;

public abstract class ObjetoArvore<T> implements Comparable<T> {
	
	public abstract boolean equals(Object object);
	public abstract int hashCode();
	public abstract int compareTo(T outro);
	public abstract String toString();

}
