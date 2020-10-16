
locals {
    #Debe ser único, ejemplo, alias = "jlgc"
    alias = "cdgh"
    #ejemplo, region = "East US 2"
    region = "Central US"
    workers = 2
    instancia = "Standard_D2_v2"
    subscripcion = "Azure subscription 1"
    #az ad sp create-for-rbac --role="Contributor" --scopes="/subscriptions/<subscriptionID>/resourceGroups/<resourceGroupName>" 
    clientid = "62af8637-ba04-45b8-9c00-8edd0dfb0676"
    clientsecret = "ItsJjQUBc.l8M.ep68BzF~lSov-bv~YW3m"
}