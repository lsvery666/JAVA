/*
	javax.swing.SpringLayout
	javax.swing.SpringLayout.Constraints
	javax.swing.Spring

	SpringLayout，弹性布局管理器。使用该布局的容器内的 
	每一个组件或容器都对应着一个约束，通过该约束定义组件或容器四条边的坐标位置 
	来实现对组件的布局。
	该布局主要涉及三个类: SpringLayout、SpringLayout.Constraints、Spring，分别表示 
	布局管理器、约束、坐标距离。

	（1）SpringLayout

	表示一个布局管理器，通过该布局管理器可以获取组件或容器的约束对象，如下:

	// 创建 弹性布局管理器 和 容器，容器 使用 弹性布局
	SpringLayout layout = new SpringLayout();
	JPanel panel = new JPanel(layout);

	// 创建 按钮组件，并添加到 容器
	JButton btn = new JButton("Button");
	panel.add(btn);

	// 获取 按钮组件 的 约束对象（如果没有，会自动创建）
	SpringLayout.Constraints btnCons = layout.getConstraints(btn);
	// 获取 容器组件 的 约束对象（如果没有，会自动创建）
	SpringLayout.Constraints panelCons = layout.getConstraints(panel);

	（2）SpringLayout.Constraints

	表示对 组件位置和尺寸的约束，每个组件实例都对应着一个约束对象，
	通过该约束可以 获取和设置 组件四条边的 坐标和宽高，常用方法如下:

	/*
		组件左上角坐标的设置（这里 X 相当于 WEST，Y 相当于 NORTH）
	 
		void    setX(Spring x)
		void    setY(Spring y)
		Spring  getX()
		Spring  getY()
	*/

	/*
		组件宽高的设置
		
		void    setWidth(Spring w)
		void    setHeight(Spring h)
		Spring  getHeight()
		Spring  getWidth()
	*/

	/*
	 * 组件指定边的的坐标或长度设置
	 * edgeName 的值为如下常量之一:
	 *      SpringLayout.NORTH, SpringLayout.SOUTH, SpringLayout.EAST, SpringLayout.WEST
	 *      SpringLayout.HORIZONTAL_CENTER, SpringLayout.VERTICAL_CENTER
	 *      SpringLayout.BASELINE
	 *      SpringLayout.WIDTH, SpringLayout.HEIGHT
	 */
	Spring  getConstraint(String edgeName)
	void    setConstraint(String edgeName, Spring s)

