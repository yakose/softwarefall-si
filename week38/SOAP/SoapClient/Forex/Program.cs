using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace Forex
{
  class Program
  {
    static void Main(string[] args)
    {

      FortuneMoney_ServiceReference.FortuneMoneySrvClient forex = new FortuneMoney_ServiceReference.FortuneMoneySrvClient();

      string val;
      Console.Write("Enter The Amount Of Krone You Will Exchange To Dollar: ");
      val = Console.ReadLine();

      double  amount = Convert.ToDouble(val);
      Console.WriteLine("Your Have Amount $: {0}", forex.exchangeFromKroneToDollar(amount));
      Console.ReadLine();

    }
  }
}
