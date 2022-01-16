from grades import calculateGrade

grade = int(input("Enter the marks of the student: ")) # se ingresa la nota que se desee convertir
exp = input("Enter the expected result: ") # se ingresa el resultado que se espera obtener al convertir la nota

result = calculateGrade(grade) # llama la funcion de conversion de notas y devuelve un resultado
if result == exp: # compara si el resultado esperado es igual con el que devuelve la funcion 
    print(f"The test was succesful! The expected result matches the actual result: {result} == {exp}") 
else: # compara si no es igual, y muestra el error
    print(f"The test fail.\nExpected result: {exp}\nActual result: {result}")


