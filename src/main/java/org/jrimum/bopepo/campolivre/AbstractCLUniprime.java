package org.jrimum.bopepo.campolivre;

import org.jrimum.domkee.financeiro.banco.febraban.Titulo;

/**
 *<p>
 * Interface comum para todos os campos livres do Banco uniprime que venham a
 * existir.
 * </p>
 * 
 */
abstract class AbstractCLUniprime extends AbstractCampoLivre {

	/**
	 * {@code serialVersionUID = -1733227746617862639L}
	 */
	private static final long serialVersionUID = -1733227746617862639L;

	/**
	 * <p>Cria um campo livre com um determinado número de campos</p>
	 * 
	 * @see AbstractCampoLivre
	 * 
	 * @param fieldsLength - Número de campos
	 * 
	 * @since 0.2
	 */
	protected AbstractCLUniprime(Integer fieldsLength) {
		
		super(fieldsLength);
	}

	protected static CampoLivre create(Titulo titulo){
		
		return new CLUniprime().build(titulo);
	}
}
