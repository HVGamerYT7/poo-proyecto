package Code;

public class Meta
{
  private float CaloriasPorDia;
  private float IMC;
  private float Peso;

  public Meta(float imc, float peso)
  {
    this.IMC = imc;
    this.Peso = peso;
  }

  public float getImc()
  {
      return this.IMC;
  }

  public float getPeso()
  {
    return this.Peso;
  }

  public float getCaloriasPorDia()
  {
    return this.CaloriasPorDia;
  }

  public void setCaloriasPorDia(float n)
  {
    this.CaloriasPorDia = n;
  }

  public void setPeso(float n)
  {
    this.Peso = n;
  }
}
