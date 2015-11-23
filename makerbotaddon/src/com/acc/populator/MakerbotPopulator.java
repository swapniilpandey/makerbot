/**
 *
 */
package com.acc.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.acc.data.MakerbotData;
import com.accenture.model.MakerbotModel;


/**
 * @author swapnil.a.pandey
 *
 */
public class MakerbotPopulator implements Populator<MakerbotModel, MakerbotData>
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final MakerbotModel source, final MakerbotData target) throws ConversionException
	{
		if (null != source)
		{
			target.setUsername(source.getUsername());
			target.setPassword(source.getPassword());
			target.setDescription(source.getDescription());
			target.setCustomermakerbotstatus(source.getCustomermakerbotstatus() == null ? false : source.getCustomermakerbotstatus()
					.booleanValue());
			target.setThingurl(source.getThingurl());
		}

	}

}
