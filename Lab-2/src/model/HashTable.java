package model;

import interfaces.IHashTable;

public class HashTable<T, K> implements IHashTable<T, K>{

public static final double LIMIT_FACTOR = 0.65; 
	
	private int slotFull;
	private int[] sizesArreglo;
	private int indexSize;
	private Node[] arrayHash;
	private double chargeFactor;
	
	public HashTable() {
		// TODO Auto-generated constructor stub
		this.slotFull = 0;
		this.sizesArreglo = new int[] {53, 101, 211, 317, 419, 509, 631, 739 ,821, 911, 997};
		this.indexSize = 0;
		this.arrayHash = new Node[sizesArreglo[indexSize]];
		this.chargeFactor = calculateChargeFactor();
	}
	
	@Override
	public void insert(T object, K key) {
		// TODO Auto-generated method stub
		if(chargeFactor <= LIMIT_FACTOR) {
			boolean insert = false;
			for(int i = 0; i < sizesArreglo[indexSize] && !insert; i++) {
				int position = funcionHash(key, i);
//				if(posicion >= tamaniosArreglo[indexTamanio]) {
//					posicion -= tamaniosArreglo[indexTamanio];
//				}
				if(arrayHash[position] == null) {
					arrayHash[position] = new Node<T, K>(object);
					arrayHash[position].setKey(key);;
					slotFull++;
					chargeFactor = calculateChargeFactor();
					insert = true;
//					System.out.println("Se inserto en: "+position);
				}else {
					if(arrayHash[position].getKey().equals(key)) {
//						|| arregloHash[posicion].getPosition() == posicion
//						arregloHash[posicion].getPosition() == posicion
						insert = true;
//						System.out.println("El objeto ya esta insertado o llave hash repetida");
					}else {
//						System.out.println("Colision en: "+position);
					}
				}
			}
		}else {
			reHashing();
			insert(object, key);
		}
	}

	@Override
	public T delete(K key) {
		// TODO Auto-generated method stub
		boolean deleted = false;
		T temporary = null;
		for(int i = 0; i < arrayHash.length && !deleted; i++) {
			int position = funcionHash(key, i);
			if(arrayHash[position] != null) {
				if(arrayHash[position].getKey().equals(key)) {
					temporary = (T) arrayHash[position].getDate();
//					System.out.println("Eliminado en la posicion: "+position);
					arrayHash[position] = null;
					slotFull--;
					chargeFactor = calculateChargeFactor();
					deleted = true;
				}
			}
		}
		return temporary;
	}

	@Override
	public T search(K key) {
		// TODO Auto-generated method stub
		boolean found = false;
		T temporary = null;
		for(int i = 0; i < arrayHash.length && !found; i++) {
			int position = funcionHash(key, i);
//			if(posicion >= arregloHash.length) {
//				posicion -= arregloHash.length;
//			}
			if(arrayHash[position] != null) {
				if(arrayHash[position].getKey().equals(key)) {
					temporary = (T) arrayHash[position].getDate();
//					System.out.println("Encontrado en la posicion: "+position);
					found = true;
				}
			}
		}
		return temporary;
	}
	
	public void reHashing() {
		Node[] temporary = arrayHash;
		if(indexSize < sizesArreglo.length) {
			indexSize++;
		}
		arrayHash = new Node[sizesArreglo[indexSize]];
		slotFull = 0;
		chargeFactor = calculateChargeFactor();
		for(int i = 0; i < temporary.length; i++) {
			if(temporary[i] != null) {
//				insert(temporar[i], );
			}
		}
	}
	
	public double calculateChargeFactor() {
		// TODO Auto-generated method stub
		return (slotFull*1.0)/sizesArreglo[indexSize];
	}
	
	public int funcionHash(K key, int indiceI) {
		int code = codeHash(key);
		int position = (funtionOne(code)+(indiceI*(funtionTwo(code))))%sizesArreglo[indexSize];
		if(position >= arrayHash.length) {
			position -= arrayHash.length;
		}
		return Math.abs(position);
	}
	
	public int codeHash(K key) {
		return key.hashCode();
	}
	
	public int funtionOne(int code) {
		return code%sizesArreglo[indexSize];
	}
	
	public int funtionTwo(int code) {
		return (code%(sizesArreglo[indexSize]-1))+1;
	}
	
	public double getChargeFactor() {
		return chargeFactor;
	}

	public void setChargeFactor(double chargeFactor) {
		this.chargeFactor = chargeFactor;
	}
	
}
