package Compiler.TellstickReplay;

/**
 * @author Per Fransman
 * Enum collection to be used in the entire service and applications.
 */
public enum TellstickMethods { 
	TURNON, TURNOFF, DIM, DIMLEVEL, BELL, UP, DOWN, STOP, LEARN,
	ADD_DEVICE, REMOVE_DEVICE, EDIT_DEVICE,
	GET_NAME, SET_NAME, GET_PROTOCOL, SET_PROTOCOL,
	GET_MODEL, SET_MODEL, SUPPORTED_METHODS,
	LAST_SENT_COMMAND, NUMBER_OF_DEVICES, RELEASE,
	CheckDeviceFeatures, 
	DimDeviceById, 
	DimDeviceByGroup, 
	TurnDeviceOffById 
}
