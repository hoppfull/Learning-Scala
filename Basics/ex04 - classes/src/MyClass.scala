class MyClass(val x: Int, var y: Int) {
    def myMethod (x: Int) = this.x * x
    def setY (y: Int) = this.y = y
    def getY () = y
    
    override def toString = "(" + x + ", " + y + ")"
    
    // getter/setter pattern:
    private var _z = 0
    def z = _z
    def z_= (value: Int): Unit = _z = value // setter trick
}
