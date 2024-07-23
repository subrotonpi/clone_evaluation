def main(args):
    tree = Node()
    tree.value = "root"
    
    n = [Node(), Node()]
    tree.nodes = n
    
    tree.nodes[0].value = "leftish"
    tree.nodes[1].value = "rightish-leafy"
    
    nn =[Node()]
    tree.nodes[0].nodes = nn
    tree.nodes[0].nodes[0].value = "off-leftish-leaf"
    
    nodes = list(tree, args[0]).toArray()
    print(Arrays.toString(nodes))