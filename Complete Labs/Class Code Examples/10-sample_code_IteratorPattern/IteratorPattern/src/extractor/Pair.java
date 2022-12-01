package extractor;

public class Pair<T1, T2> implements Comparable<Pair<T1, T2>>
{
	protected T1 t1;
	protected T2 t2;
	public Pair(T1 t1, T2 t2)
	{
		this.t1 = t1;
		this.t2 = t2;
	}

	public T1 getKey()
	{
		return t1;
	}

	public T2 getValue()
	{
		return t2;
	}

	@Override
	public int compareTo(Pair<T1, T2> o) {
		if(this.t1.hashCode() < o.t1.hashCode())
			return 1;
		else
				return 0;
	}
}