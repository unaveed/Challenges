# Username problem from Top Coder SRM 203

def newMember(existingNames, newName):
    name = ''.join(i for i in newName if not i.isdigit())
    if name in existingNames:
        i = 1
        while True:
			temp = "{0}{1}".format(name, i)
			if temp not in existingNames:
				return temp
            i += 1
    return newName
