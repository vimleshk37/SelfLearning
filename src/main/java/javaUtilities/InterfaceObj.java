package javaUtilities;

	public interface InterfaceObj {
		public void VolumeOfObject(int lenth, int width, int hight);
	
		/*
		 * public void VolumeOfObject(int lenth, int width, int hight); {
		 * System.out.println("Box Dimensions are " +lenth +" " +width +" " +hight);
		 * System.out.println("Volume of Box is " +lenth*width*hight); }
		 */
		public void AreaOfObject(int lenth, int width, int hight);
		/*
		 * public void AreaOfObject(int lenth, int width, int hight) {
		 * System.out.println("Box Dimensions are " +lenth +" " +width +" " +hight);
		 * System.out.println("Area of Box is " +2*(lenth*width + width*hight +
		 * lenth*hight)); }
		 */
		public void SumOfDimensionsOfObject(int lenth, int width, int hight);

		/*
		 * public void SumOfDimensionsOfObject(int lenth, int width, int hight) {
		 * System.out.println("Box Dimensions are " +lenth +" " +width +" " +hight);
		 * System.out.println("Area of Box is " +(lenth+ width + hight)); }
		 */
}