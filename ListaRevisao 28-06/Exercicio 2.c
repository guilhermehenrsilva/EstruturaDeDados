#include <stdio.h>

int verificarOrdemCrescente(No* ini) {
    if (inicio == NULL || ini->prox == NULL) {
        return 1;
    }

    No* atual = ini;
    while (atual->prox != NULL) {
        if (atual->dado > atual->prox->dado) {
            return 0;  
        }
        atual = atual->prox;
    }

    return 1;  
}
