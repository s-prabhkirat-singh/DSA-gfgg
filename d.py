

dict1 = {"Phy":94,"Che":70,"Bio":82,"Eng":95}

[dict1.pop(k) for k, v in dict1.items() if v > 90]

print(dict1)