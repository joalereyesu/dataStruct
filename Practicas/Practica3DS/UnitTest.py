from Figure import Figure

def circleAreaTest():
    radius = 7
    expectedResult = 153.94
    circle = Figure("circle", radius, 0)
    if (circle.getFigureArea() == expectedResult):
        return "\nCIRCLE AREA TEST PASSED"
    else: 
        return f"\nCIRCLE AREA TEST FAILED\nExpected result: {expectedResult}\nResult: {circle.getFigureArea()}"

def rectangleAreaTest():
    l = 9
    w = 7
    expectedResult = 63
    rectangle = Figure("rectangle", l, w)
    if (rectangle.getFigureArea() == expectedResult):
        return "\nRECTANGLE AREA TEST PASSED"
    else: 
        return f"\nRECTANGLE AREA TEST FAILED\nExpected result: {expectedResult}\nResult: {rectangle.getFigureArea()}"

def triangleAreaTest():
    b = 9
    h = 17
    expectedResult = 76.50
    triangle = Figure("triangle", b, h)
    if (triangle.getFigureArea() == expectedResult):
        return "\nTRIANGLE AREA TEST PASSED"
    else: 
        return f"\nTRIANGLE AREA TEST FAILED\nExpected result: {expectedResult}\nResult: {triangle.getFigureArea()}"


# print(circleAreaTest())
# print(rectangleAreaTest())
# print(triangleAreaTest())



