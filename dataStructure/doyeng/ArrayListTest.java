package dataStructure_2017_01_07;

public class ArrayListTest {
	private int size=0;
	private Object[] data=new Object[100];
	
	// ���� ������ ������ ���޹��� �� �߰�
	public boolean add(Object value){
		data[size]=value;
		size++;
		return true;
	}
	
	// ���޹��� ������ �� �ҷ�����
	public Object get(int index){
		return data[index];
	}
	
	// ���޹��� ������ �� ���� �� ������ ���� ����
	public Object remove(int index){
		// �޼ҵ� ���� �ÿ� ��ȯ�� ������ �� ��Ƶα�
		Object removed=data[index];
		// ������ index �ٷ� �������� ���� �� ������ data�� ������� ��
		for(int i=index+1; i<=size-1; i++){
			// ��ĭ�� ���� data�� ���� ����
			data[i-1]=data[i];
		}
		// ����Ʈ�� ũ�⸦ �ٿ���
		size--;
		// ���� ������ ������ ���� null�� �������
		data[size]=null;
		
		return removed;
	}
	
	// ���޹��� ������ ���޹��� ������ ���� �����
	public void set(int index, Object value){
		if(size-1>=index)
			data[index]=value;
	}
	
	// ����Ʈ�� ũ�� ���
	public int size(){
		return size;
	}
	
}
