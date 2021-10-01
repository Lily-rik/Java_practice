package jp.learningjavatext_sukkiri1.javastudy;

// interfaceは店頭メニューのような役割を果たしている
// メニューは店とお客さんとの接点であるため、英語で接点という意味を持つinterfaceが使用されている
public interface Chapter11_CleaningServise {
	Shirt washShirt(Shirt s);
	Towl washTowl(Towl t);
	Coat washCoat(Coat c);

}
