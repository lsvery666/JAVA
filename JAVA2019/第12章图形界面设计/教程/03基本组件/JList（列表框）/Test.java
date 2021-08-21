/*
	javax.swing.JList
	�б��JList ���б����ʽչʾ���ѡ������û�ѡ��һ������ѡ�
	���е�ѡ��������һ�� ListModel ʵ����ά����
	JList ��ʵ��ֱ�ӹ�������Ҫ������ʾ�����Խ�� JScrollPane ʵ�ֹ���Ч����

	���췽����
		/**
		 * һ�� JList ʵ��ά����һ�� ListModel ʵ����
		 * ListModel ʵ������ֱ�Ӵ�����Ҳ����ͨ���� ���� �� ���� ���ݵ� JList �м�Ӵ�����
		 
		JList()

		JList(ListModel dataModel)

		JList(Object[] listData)

		JList(Vector<?> listData)

	JListѡ��������ط�����
		// ��������ʽ����ѡ�����ݣ��ڲ����Զ���װ�� ListModel
		void setListData(Object[] listData)

		// �Լ�����ʽ����ѡ�����ݣ��ڲ����Զ���װ�� ListModel
		void setListData(Vector<?> listData)

		// ֱ������ѡ�����ݵ� ListModel
		void setModel(ListModel<?> model)

		// ��ȡά��ѡ�����ݵ� ListModel��
		// ��ͨ�� listModel.getElementAt(int index) �� listModel.getSize() 
		// �ɷֱ� ��ȡָ��������ѡ������ �� ѡ��������
		ListModel<?> getModel()
