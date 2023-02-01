package com.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashEquals {
    private long id;
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static void main(String[] args) {
        HashEquals h1=new HashEquals();
        HashEquals h2=new HashEquals();
	     h1.setId(100);
	     h2.setId(100);
	System.out.println(h1.equals(h2));
	
	Set<HashEquals>se=new HashSet<HashEquals>();
	
	se.add(h1);
	se.add(h2);
	System.out.println(se);
	
	}

	@Override
	public String toString() {
		return "HashEquals [id=" + id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashEquals other = (HashEquals) obj;
		return id == other.id;
	}

	
}
