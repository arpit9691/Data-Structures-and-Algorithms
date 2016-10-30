
public class CustomHashMap<K,V> {
	
	private Entry<K,V> [] table;
	int capacity = 4;
	
	static class Entry<K,V>
	{
		K key;
		V value;
		Entry<K,V> next;
		
		public Entry(K key, V value)
		{
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}
	
	public CustomHashMap()
	{
		table = new Entry[capacity];
	}
	
	public void putKeyVal(K newKey, V newVal)
	{
		if(newKey == null)
		{
			return;
		}
		
		Entry<K,V> newEntry = new Entry(newKey,newVal);
		
		int hash = countHash(newKey);
		
		if(table[hash] == null)
		{
			table[hash] = newEntry;
		}
		
		else //(table[hash] != null)
		{
			Entry<K, V> temp = table[hash];
			Entry<K, V> temp1 = table[hash];
		
			if(temp.key.equals(newEntry.key))
			{
				table[hash]=newEntry;
			}
			else
			{
				while(temp!=null)
				{ 
					if(temp.key.equals(newEntry.key))
						{
							newEntry.next=temp.next;
							break;
						}
					
					temp1=temp;
					temp=temp.next;
					
				}
				
				temp1.next=newEntry;
			}
			
		}
		
		
	}

	public V getVal(K Key)
	{
		int hash = countHash(Key);
		
		if(table[hash] == null)
		{
			return null;
		}
		else
		{
			Entry<K,V> temp = table[hash];
			while(temp!= null)
			{
				if(temp.key.equals(Key))
				{
					return temp.value;
				}
				temp = temp.next;
			}
		}
		
		return null;
	}
	public int countHash(K key)
	{
		
		return Math.abs(key.hashCode()+10) % capacity;
	}
	
	
	public void display()
	{
		int length = table.length;
		if(length == 0)
		{
			return;
		}
		
		else
		{
			for(int i =0;i<length;i++)
			{
				Entry temp=table[i];
				if(temp!=null)
				{
					while(temp!= null)
					{
						System.out.print(temp.key+"-->"+temp.value+"-->");
						temp=temp.next;
					}
					System.out.println();
					}	
			else
				{System.out.println("No Values at This Index");}
			}
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomHashMap<Integer,Integer> hci = new CustomHashMap<Integer,Integer>();

        hci.putKeyVal(21,12);
        hci.putKeyVal(25,121);
        hci.putKeyVal(30,151);
        hci.putKeyVal(33,15);
        hci.putKeyVal(35,89);
        hci.putKeyVal(25,0);
        hci.putKeyVal(null,null);
        hci.putKeyVal(null,65);
        hci.display();
        System.out.println(hci.getVal(30));

	}

}
