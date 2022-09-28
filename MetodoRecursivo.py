
def binariorecursivo(listabinarios):
    nBinario=[]

    if range(0, len(nBinario)):
        if listabinarios[0]==1:
            nBinario.append(listabinarios.split(" "))
    if listabinarios[0] == 0:
        if listabinarios[1]== 1:
            pass
    else:
        if listabinarios[0]== 1 and listabinarios[1]==1:
            breakpoint(listabinarios)

        else:
            if binariorecursivo(listabinarios):
                return

if __name__=="__main__":
    n = [101101010]
    binariorecursivo(listabinarios=[101101010])