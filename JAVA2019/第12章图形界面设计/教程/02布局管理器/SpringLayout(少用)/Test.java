/*
	javax.swing.SpringLayout
	javax.swing.SpringLayout.Constraints
	javax.swing.Spring

	SpringLayout�����Բ��ֹ�������ʹ�øò��ֵ������ڵ� 
	ÿһ���������������Ӧ��һ��Լ����ͨ����Լ��������������������ߵ�����λ�� 
	��ʵ�ֶ�����Ĳ��֡�
	�ò�����Ҫ�漰������: SpringLayout��SpringLayout.Constraints��Spring���ֱ��ʾ 
	���ֹ�������Լ����������롣

	��1��SpringLayout

	��ʾһ�����ֹ�������ͨ���ò��ֹ��������Ի�ȡ�����������Լ����������:

	// ���� ���Բ��ֹ����� �� ���������� ʹ�� ���Բ���
	SpringLayout layout = new SpringLayout();
	JPanel panel = new JPanel(layout);

	// ���� ��ť���������ӵ� ����
	JButton btn = new JButton("Button");
	panel.add(btn);

	// ��ȡ ��ť��� �� Լ���������û�У����Զ�������
	SpringLayout.Constraints btnCons = layout.getConstraints(btn);
	// ��ȡ ������� �� Լ���������û�У����Զ�������
	SpringLayout.Constraints panelCons = layout.getConstraints(panel);

	��2��SpringLayout.Constraints

	��ʾ�� ���λ�úͳߴ��Լ����ÿ�����ʵ������Ӧ��һ��Լ������
	ͨ����Լ������ ��ȡ������ ��������ߵ� ����Ϳ�ߣ����÷�������:

	/*
		������Ͻ���������ã����� X �൱�� WEST��Y �൱�� NORTH��
	 
		void    setX(Spring x)
		void    setY(Spring y)
		Spring  getX()
		Spring  getY()
	*/

	/*
		�����ߵ�����
		
		void    setWidth(Spring w)
		void    setHeight(Spring h)
		Spring  getHeight()
		Spring  getWidth()
	*/

	/*
	 * ���ָ���ߵĵ�����򳤶�����
	 * edgeName ��ֵΪ���³���֮һ:
	 *      SpringLayout.NORTH, SpringLayout.SOUTH, SpringLayout.EAST, SpringLayout.WEST
	 *      SpringLayout.HORIZONTAL_CENTER, SpringLayout.VERTICAL_CENTER
	 *      SpringLayout.BASELINE
	 *      SpringLayout.WIDTH, SpringLayout.HEIGHT
	 */
	Spring  getConstraint(String edgeName)
	void    setConstraint(String edgeName, Spring s)

