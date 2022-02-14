import math
import cProfile, re

class Figure:
    def __init__(self, figureName, val1, val2):
        self.figureName = figureName
        self.val1 = val1
        self.val2 = val2
    
    def getFigureArea (self):
        if (self.figureName.upper() == 'CIRCLE'):
            return round(math.pi * self.val1**2, 2)
        elif (self.figureName.upper() == 'RECTANGLE'):
             return round(self.val1 * self.val2, 2)
        elif (self.figureName.upper() == 'TRIANGLE'):
            return round((self.val1*self.val2)/2, 2)
        else:
            return False

#PROFILING DEL CODIGO
cProfile.run('re.compile("Figure")')

#FUNCIONAMIENTO
name = input("FIGURE AREA CALCULATOR\nOptions: circle, rectangle, triangle\nFor the circle option enter only one variable and set the second one to 0.\n\nEnter the name of the figure you want to calculate the area: ")
val1 = int(input("Enter first value: "))
val2 = int(input("Enter second value: "))

figure = Figure(name, val1, val2)
if figure.getFigureArea() == False:
    print(f"{name} is not an option. Try again.")
else: 
    print(f"Area: {figure.getFigureArea()}")